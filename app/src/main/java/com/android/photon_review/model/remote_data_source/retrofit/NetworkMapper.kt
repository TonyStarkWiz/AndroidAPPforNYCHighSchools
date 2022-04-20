package com.android.photon_review.model.remote_data_source.retrofit

import com.android.photon_review.model.DomainModelItem

import com.android.photon_review.model.remote_data_source.retrofit.util.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor() : EntityMapper<NetworkEntity, DomainModelItem>{

    override fun mapFromEntity(initial: List<NetworkEntity>): List<DomainModelItem> {
        return initial.map {
            DomainModelItem(
                school_name = it.school_name,
                location = it.location,
                overview_paragraph = it.overview_paragraph,
                attendance_rate = it.attendance_rate,
                pct_stu_enough_variety = it.pct_stu_enough_variety,
                pct_stu_safe = it.pct_stu_safe,
                offer_rate1 = it.offer_rate1
            )
        }
    }

    override fun mapToEntity(initial: List<DomainModelItem>): List<NetworkEntity> {
        return initial.map {
             NetworkEntity(
                 school_name = it.school_name,
                 location = it.location,
                 overview_paragraph = it.overview_paragraph,
                 attendance_rate = it.attendance_rate,
                 pct_stu_enough_variety = it.pct_stu_enough_variety,
                 pct_stu_safe = it.pct_stu_safe,
                 offer_rate1 = it.offer_rate1
             )
        }
    }
/*
    // both
    fun mapFromEntityList(entities: List<NetworkEntity>): List<DomainModelItem>{
        return entities.map { mapFromEntity(it) }
    }
*/
}