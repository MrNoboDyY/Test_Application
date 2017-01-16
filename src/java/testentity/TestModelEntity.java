/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Milou
 */
@Entity
@XmlRootElement
public class TestModelEntity implements Serializable {
    
    List<TestModelEntity> models = new ArrayList<>() ;

    public TestModelEntity() {
    }

    public List<TestModelEntity> getModels() {
        return models;
    }

    public void setModels(List<TestModelEntity> models) {
        this.models = models;
    }
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestModelEntity)) {
            return false;
        }
        TestModelEntity other = (TestModelEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TestModelEntity{" + "models=" + models + ", id=" + id + '}';
    }

    

    
    
}
