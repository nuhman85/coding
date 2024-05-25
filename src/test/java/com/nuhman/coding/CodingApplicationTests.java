package com.nuhman.coding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class CodingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMapToArray() {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", Arrays.asList(3,5));
		map.put("key2", Arrays.asList(3,5));

		Object[][] arr =
				map.entrySet().stream()
						.map(e -> new Object[]{e.getKey(), e.getValue()})
						.toArray(Object[][]::new);

		System.out.println(Arrays.deepToString(arr));
	}

}
