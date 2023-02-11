package com.kanbanboardproject.kanbanservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectMember {
    @Id
    private String memberEmail;
    private String memberName;
    private int noOfTask;
//    private List<Task> taskList;
}
