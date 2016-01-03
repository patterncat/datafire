package com.genericmethod.feedfire.sample;

import com.genericmethod.feedfire.request.AbstractOkHttpFeedRequester;
import com.squareup.okhttp.HttpUrl;

import org.springframework.stereotype.Component;

@Component
public class SampleFeedRequester extends AbstractOkHttpFeedRequester {

  @Override
  public HttpUrl getFeedUrl() {
    return new HttpUrl.Builder()
            .scheme("http")
            .host("localhost")
            .port(8080)
            .addPathSegment("v1")
            .addPathSegment("feed")
            .build();
  }
}
