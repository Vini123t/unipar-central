
package br.unipar.central.enums;

public enum OperadoraEnum {
    
    TIM(1),
    CLARO(2),
    VIVO(3),
    OI(4),
    CORREIOS(5),
    LARICELL(6),
    TESLA(7),
    IPHONE(8),
    OUTROS(9),
    VALOR44(44),
    VALOR21(21),
    VALOR45(45),
    VALOR11(11),
    VALOR34(34);
    

    private final int numero;

    private OperadoraEnum(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public static OperadoraEnum paraEnum(int codigo) {
        for (OperadoraEnum tipo : OperadoraEnum.values()) {
            if (tipo.getNumero()== codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido!");
    }
}