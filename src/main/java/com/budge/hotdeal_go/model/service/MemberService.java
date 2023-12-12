package com.budge.hotdeal_go.model.service;

import java.util.Map;

import com.budge.hotdeal_go.model.dto.MemberDto;

public interface MemberService {

	MemberDto findByProviderId(MemberDto memberDto);

	void registerMember(MemberDto memberDto);

	void saveRefreshToken(Map<String, Object> saveMap);

	MemberDto loginMember(MemberDto memberDto);

}