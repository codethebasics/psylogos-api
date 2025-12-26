package core.data;

import core.enums.PingStatusEnum;

public final class PingStatus {
    private final PingStatusEnum status;

    public PingStatus(PingStatusEnum status) {
        this.status = status;
    }

    public PingStatusEnum getStatus() {
        return status;
    }
}
