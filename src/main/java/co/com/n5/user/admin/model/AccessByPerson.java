package co.com.n5.user.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table (name = "access_by_person")
@ApiModel(value = "Access by Role Data Object", description = "Save the relationship between Access and Role information")
public class AccessByPerson {

    @Id
    @Column(name="access_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Identifier of the Access level")
    private Long id;

    @ApiModelProperty(notes = "Identifier of the Person")
    private Long idPerson;

    @ApiModelProperty(notes = "Identifier of the Access")
    private Long idAccess;

}
