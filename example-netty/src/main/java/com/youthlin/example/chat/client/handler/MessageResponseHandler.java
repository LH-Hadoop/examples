package com.youthlin.example.chat.client.handler;

import com.youthlin.example.chat.protocol.request.MessageRequestPacket;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 创建: youthlin.chen
 * 时间: 2018-11-13 14:55
 */
@ChannelHandler.Sharable
public class MessageResponseHandler extends SimpleChannelInboundHandler<MessageRequestPacket> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageResponseHandler.class);
    public static final MessageResponseHandler INSTANCE = new MessageResponseHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageRequestPacket msg) throws Exception {
        LOGGER.info("收到消息 {}", msg);
        System.out.println(msg.getFromUser() + ">" + msg.getToUser() + ": " + msg.getText());
    }

}
