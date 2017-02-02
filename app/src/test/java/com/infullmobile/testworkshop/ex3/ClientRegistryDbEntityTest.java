package com.infullmobile.testworkshop.ex3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/* Can I try TDD please ? */
/* Is it okay if I don't care about corner cases ? */
public class ClientRegistryDbEntityTest {

    @Test
    public void shouldBuildClientRegistryFromArrayOfIds() {
        // given
        final Integer[] ids = {1, 2, 3};

        // when
        ClientRegistryDbEntity clientRegistryDbEntity = ClientRegistryDbEntity.Companion.from(ids);

        // then
        assertThat(clientRegistryDbEntity.getIdsSeparatedByComma()).isEqualTo("1,2,3");
    }

//    @Test
//    public void shouldCombineTwoRegistries() {
//        // given
//        final Integer[] idSetA = {1, 2, 3};
//        final Integer[] idSetB = {4, 5, 6};
//        ClientRegistryDbEntity registryA = ClientRegistryDbEntity.Companion.from(idSetA);
//        ClientRegistryDbEntity registryB = ClientRegistryDbEntity.Companion.from(idSetB);
//
//        // when
//        ClientRegistryDbEntity registryC = registryA.plus(registryB);
//
//        // then
//        assertThat(registryC.getIdsSeparatedByComma()).isEqualTo("1,2,3,4,5,6");
//    }

//    @Test
//    public void shouldCombineTwoRegistriesWhenTheFirstOneIsEmpty() {
//        // given
//        final Integer[] emptySet = {};
//        final Integer[] idSetB = {4, 5, 6};
//        ClientRegistryDbEntity registryA = ClientRegistryDbEntity.Companion.from(emptySet);
//        ClientRegistryDbEntity registryB = ClientRegistryDbEntity.Companion.from(idSetB);
//
//        // when
//        ClientRegistryDbEntity registryC = registryA.plus(registryB);
//
//        // then
//        assertThat(registryC.getIdsSeparatedByComma()).isEqualTo("4,5,6");
//    }

//    @Test
//    public void shouldCombineTwoRegistriesWhenTheSecondOneIsEmpty() {
//        // given
//        final Integer[] idSetA = {1, 2, 3};
//        final Integer[] emptySet = {};
//        ClientRegistryDbEntity registryA = ClientRegistryDbEntity.Companion.from(idSetA);
//        ClientRegistryDbEntity registryB = ClientRegistryDbEntity.Companion.from(emptySet);
//
//        // when
//        ClientRegistryDbEntity registryC = registryA.plus(registryB);
//
//        // then
//        assertThat(registryC.getIdsSeparatedByComma()).isEqualTo("1,2,3");
//    }

//    @Test
//    public void shouldCombineTwoRegistriesWhenBothAreEmpty() {
//        // given
//        final Integer[] emptySetA = {};
//        final Integer[] emptySetB = {};
//        ClientRegistryDbEntity registryA = ClientRegistryDbEntity.Companion.from(emptySetA);
//        ClientRegistryDbEntity registryB = ClientRegistryDbEntity.Companion.from(emptySetB);
//
//        // when
//        ClientRegistryDbEntity registryC = registryA.plus(registryB);
//
//        // then
//        assertThat(registryC.getIdsSeparatedByComma()).isEqualTo("");
//    }
}