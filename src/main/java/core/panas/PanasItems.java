package core.panas;

import core.enums.PanasStatusEnum;

public final class PanasItems {
    private final PanasStatusEnum[] items;

    public PanasItems(PanasStatusEnum[] items) {
        this.items = items;
    }

    public PanasStatusEnum[] getItems() {
        return items;
    }
}
