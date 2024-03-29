package com.ikuzMirel.flick.domain.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ikuzMirel.flick.domain.model.Friend
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "friends")
data class FriendEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "uid")
    val userId: String,
    @ColumnInfo(name = "name")
    val username: String,
    @ColumnInfo(name = "cid")
    val collectionId: String,
    @ColumnInfo(name = "friend_with")
    val friendWith: String,
    @ColumnInfo(name = "latest_message")
    val latestMessage: String,
    @ColumnInfo(name = "unread_count")
    val unreadCount: Int,
    @ColumnInfo(name = "last_read_message_time")
    val lastReadMessageTime: Long
)

fun FriendEntity.toFriend() = Friend(
    name = username,
    userId = userId,
    collectionId = collectionId,
    latestMessage = latestMessage,
    unreadCount = unreadCount,
    status = 1
)