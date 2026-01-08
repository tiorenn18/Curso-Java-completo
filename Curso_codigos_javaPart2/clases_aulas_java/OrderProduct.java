package clases_aulas_java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderProduct {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatusProducts status;

    private ClientProduct client;
    private List <Orderitem> items = new ArrayList<>();

    public OrderProduct(){
       
    }
    
    public OrderProduct(Date moment, OrderStatusProducts status, ClientProduct client) {
        this.moment = moment;
        this.status = status;
        this.client = client;

    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusProducts getStatus() {
        return status;
    }

    public void setStatus(OrderStatusProducts status) {
        this.status = status;
    }

    public void setClient(ClientProduct client) {
        this.client = client;
    }

    public ClientProduct getClient() {
        return client;
    }

    public List<Orderitem> getItems(){
        return items;
    }

    public void addItems(Orderitem item){
        items.add(item);
    }
    public void removeItems(Orderitem item){
        items.remove(item);
    }
    public double total(){
        double sum = 0.0;
        for (Orderitem item : items ){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for (Orderitem item : items ){
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
