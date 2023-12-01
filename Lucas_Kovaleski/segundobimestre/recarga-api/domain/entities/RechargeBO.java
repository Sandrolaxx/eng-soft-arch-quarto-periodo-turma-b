public class RechargeBO {
    String id;
    Double value;
    String document;
    Integer operatorId;
    PhoneDTO phone; 
    String receipt;
    Long transactionId;
    boolean sucess;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public Integer getOperatorId() {
        return operatorId;
    }
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }
    public PhoneDTO getPhone() {
        return phone;
    }
    public void setPhone(PhoneDTO phone) {
        this.phone = phone;
    }
    public String getReceipt() {
        return receipt;
    }
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
    public Long getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    public boolean isSucess() {
        return sucess;
    }
    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    } 

}
