package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/* Um DTO (Data Transfer Object) é um padrão de projeto utilizado para transferência de dados.*/
@Data // Lombok - Equivalente as anotações: @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Builder // Lombok - Produz APIs de construtor complexas automaticamente para a classe (Builder pattern).
@NoArgsConstructor // Lombok - Cria um construtor vazio.
@AllArgsConstructor // Lombok - Cria um construtor recebendo todos os parâmetros.
public class PersonDTO {

    private Long id;

    @NotEmpty // Indica que este campo nunca pode ser vazio.
    @Size(min = 2, max = 100) // Limita o número de caracteres.
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF // Validação do CPF
    private String cpf;

    @NotNull
    private String birthDate;

    @Valid // Indica que cada um dos dados da lista de telefones precisam ser validados (através dos atributos da classe).
    @NotEmpty
    private List<PhoneDTO> phones;

}
