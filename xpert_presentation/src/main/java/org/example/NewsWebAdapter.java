package org.example;

import lombok.RequiredArgsConstructor;
import org.example.domain.news.dto.response.GetNewsListResponseDto;
import org.example.domain.news.usecase.GetNewsListUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsWebAdapter {
    private final GetNewsListUseCase getNewsListUseCase;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/list")
    public GetNewsListResponseDto getNewsListUseCase() {
        return getNewsListUseCase.execute();
    }
}
