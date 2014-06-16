package com.conway.pangpang.repo;

import java.util.List;

import com.conway.pangpang.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
