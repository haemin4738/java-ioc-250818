package com.ll.domain.testPost.service;

import com.ll.domain.testPost.repository.TestPostRepository;
import com.ll.framework.annotations.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestPostService {
    private final TestPostRepository testPostRepository;
}
