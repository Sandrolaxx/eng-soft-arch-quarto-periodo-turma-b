package main.java.com.fag.infra.panache.model;
        
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "AKT_RECHARGE")
public class PanacheRecharge extends PanacheEntityBase {
    
    @Id
    private UUID id;
    
    @Column(name = "AMOUNT")
    private Double value;
    
    @Column(name = "DOCUMENT")
    private String document;
    
    @Column(name = "OPERATOR_ID")
    private Integer operatorId;
    
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    
    @Column(name = "RECEIPT", length = 4000)
    private String receipt;
    
    @Column(name = "TRANSACTIONID")
    private Long transactionId;
    
    @Column(name = "SUCCESS")
    private boolean success;
    
    public UUID getId(){
        return id;
    }
    
    public void setID(UUID id){
        this.id = id;
    }
    
    public Double getValue(){
        return value;
    }
    
    public void setValue(Double value){
        this.value = value;
    }
    
    public String getDocument(){
        return document;
    }
    
    public void setDocument(String document){
        this.document = document;
    }
    
    public Integer getOperatorId(){
        return operatorId;
    }
    
    public void setOperatorId(Integer operatorId){
        this.operatorId = operatorId;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getReceipt(){
        return receipt;
    }
    
    public void setReceipt(String receipt){
        this.receipt = receipt;
    }
    
    public Long getTransactionId(){
        return transactionId;
    }
    
    public void setTransactionId(Long transactionId){
        this.transactionId = transactionId;
    }
    
    public boolean isSuccess(){
        return success;
    }
    
    public void setSuccess(boolean sucess){
        this.success = sucess;
    }
}