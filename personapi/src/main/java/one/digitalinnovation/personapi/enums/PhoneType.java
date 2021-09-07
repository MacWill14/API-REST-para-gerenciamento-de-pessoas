package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // Lombok - Cria os métodos getters.
@AllArgsConstructor // Lombok - Cria um construtor recebendo todos os parâmetros.
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
