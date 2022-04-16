package kr.springboot.study;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class StudyTest {

    /**
     * 테스트 메서드 작성시 이름이 길때 _ 를 써서 이름을 짓자
     */

    @Test
    void create_hello_HAHAHHA() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @DisplayName("만들기")
    @Disabled // disabled
    void create1() {
        System.out.println("create1");
    }

    @BeforeAll // 모든 테스트 시작 전
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll // 모든 테스트 시작 후
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach // 테스트 단위 마다 시작 전 each
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach // 테스트 단위 마다 시작 후 each
    void afterEach() {
        System.out.println("after each");
    }



}
