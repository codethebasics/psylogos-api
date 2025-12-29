package core.enums;

public enum PanasStatusEnum {
    AFLITO("Aflito"),
    AMAVEL("Amável"),
    AMEDRONTADO("Amedrontado"),
    ANGUSTIADO("Angustiado"),
    ANIMADO("Animado"),
    APAIXONADO("Apaixonado"),
    DETERMINADO("Determinado"),
    DINAMICO("Dinâmico"),
    ESTUSIASMADO("Entusiasmado"),
    FORTE("Forte"),
    HUMILHADO("Humilhado"),
    INCOMODADO("Incomodado"),
    INQUIETO("Inquieto"),
    INSPIRADO("Inspirado"),
    IRRITADO("Irritado"),
    NERVOSO("Nervoso"),
    ORGULHOSO("Orgulhoso"),
    PERTURBADO("Perturbado"),
    RANCOROSO("Rancoroso"),
    VIGOROSO("Vigoroso");

    private final String descricao;

    PanasStatusEnum(String descricao) {
        this.descricao = descricao;
    }
}
