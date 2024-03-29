package com.ikuzMirel.flick.data.remote.chat

import com.ikuzMirel.flick.data.constants.ENDPOINT_CHAT_MESSAGES
import com.ikuzMirel.flick.data.constants.UNAUTHENTICATED
import com.ikuzMirel.flick.data.response.BasicResponse
import com.ikuzMirel.flick.data.response.MessageListResponse
import com.ikuzMirel.flick.data.response.processHttpResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import javax.inject.Inject

class ChatRemoteImpl @Inject constructor(
    private val client: HttpClient
): ChatRemote {
    override suspend fun getChatMessages(collectionId: String): BasicResponse<MessageListResponse> {
        return processHttpResponse(
            request = client.get(ENDPOINT_CHAT_MESSAGES) {
                parameter("id", collectionId)
            },
            specificError = UNAUTHENTICATED
        )
    }
}