package org.kcsmini2.ojeommo.member.dto;

import lombok.*;

/**
 * 작성자: 김준연
 *
 * 설명: Member 엔티티를 Contoller 단에서 사용하기위한 DTO
 *
 * 최종 수정 일자: 2023/07/24
 */
@Getter
@Setter
public class SignRequest {
    private String id;
    private String pw;
    private String nickname;
    private String name;
    private String email;
}
