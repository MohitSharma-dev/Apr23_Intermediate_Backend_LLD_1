package ParkingLot.models;

import java.util.Date;

public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date modifiedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}

// For every use case
    // IssueToken
        // Major model : CRUD : Token Model
        // TokenController
        // Name the controller on the model
