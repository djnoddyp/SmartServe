package tech.nodder.smartserve.model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double cost;
    private Boolean approvalNeeded;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getApprovalNeeded() {
        return approvalNeeded;
    }

    public void setApprovalNeeded(Boolean approvalNeeded) {
        this.approvalNeeded = approvalNeeded;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order requisition) {
        this.order = requisition;
        if (!requisition.getItems().contains(this)) {
            requisition.getItems().add(this);
        }
    }
}
