package com.ysh.studySpring.dependency;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component //spring이 관리하는 파일
@Data //기본 생성자
@RequiredArgsConstructor
public class Restaurant {
	private final Chef chef;
}
