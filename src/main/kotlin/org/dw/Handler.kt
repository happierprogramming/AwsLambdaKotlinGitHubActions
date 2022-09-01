package org.dw

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import kotlinx.coroutines.runBlocking

class Handler : RequestHandler<Map<String?, String>, String> {

    override fun handleRequest(event: Map<String?, String>, context: Context): String = runBlocking {
        val logger = context.logger

        logger.log("Hello Kotlin AWS Lambda World!")

        return@runBlocking "{ \"value\" : \"Hello Kotlin World!\" }"
    }
}