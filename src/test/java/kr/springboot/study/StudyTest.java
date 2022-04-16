package kr.springboot.study;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudyTest {

    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
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
