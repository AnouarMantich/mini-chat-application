package org.app.chatapp.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class ChatMessage {
    private Integer id;
    private String content;
    private String sender;
}
