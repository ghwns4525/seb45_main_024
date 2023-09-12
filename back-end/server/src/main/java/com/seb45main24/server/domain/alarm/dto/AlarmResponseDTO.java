package com.seb45main24.server.domain.alarm.dto;

import com.seb45main24.server.domain.alarm.entity.Alarm;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AlarmResponseDTO {
    private long alarmId;
    private Alarm.AlarmType alarmType;
    private String nickname;
    private String title;
    private long memberBoardId;
}
