package com.quinsicstudio.framework.security.entity.po;

import com.quinsicstudio.framework.base.entity.BasePo;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "um_user")
public class UserPo extends BasePo {

    @Id
    @GenericGenerator(name = "um_user_generator", strategy = "com.quinsicstudio.framework.base.generator.SnowflakeIdGenerator")
    @GeneratedValue(generator = "um_user_generator")
    @Column(name = "id")
    private Long id;
}
