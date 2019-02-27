public enum StatusOrder {

    SUBMITTED("Zlozone"),
    READY_TO_SHIP("Gotowe do wysylki"),
    SHIPPED("Wyslane"),
    COMPLETED("Zrealizowane"),
    CANCELED("Anulowane");

    String status;

    StatusOrder(String s){
        status = s;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return this.status;
    }

}
