package com.infullmobile.testworkshop.ex3

class ClientRegistryDbEntity (
        val idsSeparatedByComma: String
) {

    //TODO add method plus()

    companion object {
        fun from(listOfIds: Array<Int>): ClientRegistryDbEntity {
            return ClientRegistryDbEntity(listOfIds.joinToString(","))
        }
    }
}
