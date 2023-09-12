package com.seb45main24.server.domain.alarm.entity;

import com.seb45main24.server.domain.account.entity.Account;
import com.seb45main24.server.domain.member_board.entity.MemberBoard;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Alarm {
    public enum AlarmType {
        ACCEPT,
        REPLY
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alarmId;

    @Enumerated(EnumType.STRING)
    private AlarmType alarmType;

    @ManyToOne
    @JoinColumn(name = "WRITER_ID")
    private Account writer;

    @ManyToOne
    @JoinColumn(name = "TARGET_ID")
    private Account target;

    @ManyToOne
    @JoinColumn
    private MemberBoard memberBoard;
}
