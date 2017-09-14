/*
 * All GTAS code is Copyright 2016, The Department of Homeland Security (DHS), U.S. Customs and Border Protection (CBP).
 *
 * Please see LICENSE.txt for details.
 */
package gov.gtas.model.lookup;

import gov.gtas.model.BaseEntityAudit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rule_category")
public class RuleCat extends BaseEntityAudit {
    private static final long serialVersionUID = 1L;

    @Column(name = "catId", nullable = false)
    private Long catId;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "priority", nullable = false)
    private String priority;

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
