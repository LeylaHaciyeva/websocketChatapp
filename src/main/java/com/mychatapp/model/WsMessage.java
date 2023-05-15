package com.mychatapp.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class WsMessage {

    private String sender;
    private String message;
}