package com.android.photon_review.model.remote_data_source.retrofit

import com.android.photon_review.model.DomainModel
import com.android.photon_review.model.remote_data_source.retrofit.util.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor() : EntityMapper<NetworkEntity, DomainModel>{
    override fun mapFromEntity(entity: NetworkEntity): DomainModel {
        TODO("Not yet implemented")
    }

    override fun mapToEntity(domainModel: DomainModel): NetworkEntity {
        TODO("Not yet implemented")
    }
}