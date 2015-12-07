package loputoo;

import java.util.ArrayList;

/**
 * Created by marva on 3.12.15.
 */
public class ChatRooms {
    public static ArrayList<ChatRoom> chatRooms = new ArrayList<ChatRoom>();

    public static ChatRoom newChatRoom(String name, User u) {
        ChatRoom cr = new ChatRoom(name, u);
        chatRooms.add(cr);
        return cr;
    }

    public static void joinChatRoom(String chatroomName, User u) {

        for (ChatRoom cr : chatRooms) {
            if (cr.toString().equals(chatroomName)) {
                cr.join(u);
                String teade = u + "connected";
            }
        }
    }

    public static boolean ifChatRoomExists(String name) {

        for (ChatRoom room : chatRooms) {
            if (room.toString().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static ChatRoom getChatRoom(String name) {
        for (ChatRoom room : chatRooms) {
            if (room.toString().equals(name)) {
                return room;
            }
        }
        return null;
    }

    public static void showChatRooms() {
        for (ChatRoom room : chatRooms) {
            System.out.println(room);
        }
    }
}
