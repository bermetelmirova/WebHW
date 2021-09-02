package com.company.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Time {
    String  currentTime;

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime.getHours() + ":" + currentTime.getMinutes();
    }
}
