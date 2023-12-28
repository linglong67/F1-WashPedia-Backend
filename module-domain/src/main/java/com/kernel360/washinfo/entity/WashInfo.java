package com.kernel360.washinfo.entity;

import com.kernel360.base.BaseEntity;
import com.kernel360.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "wash_info")
public class WashInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wash_info_id_gen")
    @SequenceGenerator(name = "wash_info_id_gen", sequenceName = "wash_info_wash_no_seq", allocationSize = 50)
    @Column(name = "wash_no", nullable = false)
    private Integer washNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_no", nullable = false)
    private Member memberNo;

    @Column(name = "wash_count")
    private Integer washCount;

    @Column(name = "monthly_expense")
    private Integer monthlyExpense;

    @Column(name = "interest", length = Integer.MAX_VALUE)
    private String interest;

    @Column(name = "driving_env", length = Integer.MAX_VALUE)
    private String drivingEnv;

    @Column(name = "parking_env", length = Integer.MAX_VALUE)
    private String parkingEnv;

}