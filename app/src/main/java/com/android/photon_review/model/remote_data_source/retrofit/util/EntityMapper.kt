package com.android.photon_review.model.remote_data_source.retrofit.util

import com.android.photon_review.model.DomainModelItem
import com.android.photon_review.model.remote_data_source.retrofit.NetworkEntity

interface EntityMapper<Entity, DomainModelItem> {
    fun mapFromEntity(entity: List<NetworkEntity>): List<com.android.photon_review.model.DomainModelItem>
    fun mapToEntity(domainModelItem: List<com.android.photon_review.model.DomainModelItem>):  List<NetworkEntity>
}