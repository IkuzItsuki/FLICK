package com.ikuzMirel.flick.data.repositories

import com.ikuzMirel.flick.data.model.UserData
import com.ikuzMirel.flick.data.response.BasicResponse
import com.ikuzMirel.flick.data.response.FriendListResponse
import com.ikuzMirel.flick.data.response.UserListResponse
import com.ikuzMirel.flick.domain.entities.FriendEntity
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getUserInfo(userId: String): Flow<BasicResponse<UserData>>
    suspend fun getUserFriends(): Flow<BasicResponse<FriendListResponse>>
    suspend fun getUserFriend(friendUserId: String): Flow<BasicResponse<FriendEntity>>
    suspend fun searchUsers(searchQuery: String): Flow<BasicResponse<UserListResponse>>
}