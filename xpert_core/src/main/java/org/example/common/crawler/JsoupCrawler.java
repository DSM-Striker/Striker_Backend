package org.example.common.crawler;

import org.example.domain.news.dto.response.GetNewsListResponseDto;

public interface JsoupCrawler {

    GetNewsListResponseDto NaverNewsListCrawling();
}
