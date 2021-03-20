package com.github.prgrms.orders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.prgrms.utils.ApiUtils;
import com.github.prgrms.utils.ApiUtils.ApiResult;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("api/orders")
public class ReviewRestController {
  // TODO review 메소드 구현이 필요합니다.
  @PostMapping("/{id}/review")
  public ApiResult<>

   // FIXME `요건 1` 정의에 맞게 응답 타입 수정이 필요합니다.
  @GetMapping(path = "{id}")
  public ApiResult<ProductDto> findById(@PathVariable Long id) {
    return productService.findById(id)
      .map(product -> ApiUtils.success(new ProductDto(product)))
      .orElseThrow(() -> new NotFoundException("Could not found product for " + id));
  }
}