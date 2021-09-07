package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/* Um DTO (Data Transfer Object) é um padrão de projeto utilizado para transferência de dados.*/
@Data// Lombok - Equivalente as anotações: @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Builder // Lombok - Produz APIs de construtor complexas automaticamente para a classe (Builder pattern).
@NoArgsConstructor // Lombok - Cria um construtor vazio.
@AllArgsConstructor // Lombok - Cria um construtor recebendo todos os parâmetros.
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)  // Enumeração do tipo String..
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

}
