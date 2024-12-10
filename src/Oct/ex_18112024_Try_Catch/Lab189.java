package Oct.ex_18112024_Try_Catch;

public class Lab189 {
    private String currency;
    private Integer amount;

    public Lab189(String currency, Integer amount){
        this.currency=currency;
        this.amount=amount;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
public Integer add(Lab189 bankname) throws Exception{
       if (!bankname.currency.equalsIgnoreCase("INR")){
           throw new Exception("Currency missmatch");
       }
       return bankname.amount+this.amount;
}
}
