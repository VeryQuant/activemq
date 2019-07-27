//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.store.kahadb.data;


public final class KahaSubscriptionCommand extends KahaSubscriptionCommandBase<KahaSubscriptionCommand> implements org.apache.activemq.store.kahadb.JournalCommand<KahaSubscriptionCommand> {

   public java.util.ArrayList<String> missingFields() {
      java.util.ArrayList<String> missingFields = super.missingFields();
      if(  !hasDestination() ) {
         missingFields.add("destination");
      }
      if(  !hasSubscriptionKey() ) {
         missingFields.add("subscriptionKey");
      }
      if( hasDestination() ) {
         try {
            getDestination().assertInitialized();
         } catch (org.apache.activemq.protobuf.UninitializedMessageException e){
            missingFields.addAll(prefix(e.getMissingFields(),"destination."));
         }
      }
      return missingFields;
   }

   public void clear() {
      super.clear();
      clearDestination();
      clearSubscriptionKey();
      clearRetroactive();
      clearSubscriptionInfo();
   }

   public KahaSubscriptionCommand clone() {
      return new KahaSubscriptionCommand().mergeFrom(this);
   }

   public KahaSubscriptionCommand mergeFrom(KahaSubscriptionCommand other) {
      if (other.hasDestination()) {
         if (hasDestination()) {
            getDestination().mergeFrom(other.getDestination());
         } else {
            setDestination(other.getDestination().clone());
         }
      }
      if (other.hasSubscriptionKey()) {
         setSubscriptionKey(other.getSubscriptionKey());
      }
      if (other.hasRetroactive()) {
         setRetroactive(other.getRetroactive());
      }
      if (other.hasSubscriptionInfo()) {
         setSubscriptionInfo(other.getSubscriptionInfo());
      }
      return this;
   }

   public int serializedSizeUnframed() {
      if (memoizedSerializedSize != -1)
         return memoizedSerializedSize;

      int size = 0;
      if (hasDestination()) {
         size += computeMessageSize(1, getDestination());
      }
      if (hasSubscriptionKey()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeStringSize(2, getSubscriptionKey());
      }
      if (hasRetroactive()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeBoolSize(3, getRetroactive());
      }
      if (hasSubscriptionInfo()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeBytesSize(4, getSubscriptionInfo());
      }
      memoizedSerializedSize = size;
      return size;
   }

   public KahaSubscriptionCommand mergeUnframed(org.apache.activemq.protobuf.CodedInputStream input) throws java.io.IOException {
      while (true) {
         int tag = input.readTag();
         if ((tag & 0x07) == 4) {
            return this;
         }
         switch (tag) {
         case 0:
            return this;
         default: {
            break;
         }
         case 10:
            if (hasDestination()) {
               getDestination().mergeFramed(input);
            } else {
               setDestination(new KahaDestination().mergeFramed(input));
            }
            break;
         case 18:
            setSubscriptionKey(input.readString());
            break;
         case 24:
            setRetroactive(input.readBool());
            break;
         case 34:
            setSubscriptionInfo(input.readBytes());
            break;
         }
      }
   }
   public void writeUnframed(org.apache.activemq.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (hasDestination()) {
         writeMessage(output, 1, getDestination());
      }
      if (hasSubscriptionKey()) {
         output.writeString(2, getSubscriptionKey());
      }
      if (hasRetroactive()) {
         output.writeBool(3, getRetroactive());
      }
      if (hasSubscriptionInfo()) {
         output.writeBytes(4, getSubscriptionInfo());
      }
   }

   public static KahaSubscriptionCommand parseUnframed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaSubscriptionCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseUnframed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaSubscriptionCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseUnframed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaSubscriptionCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseUnframed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaSubscriptionCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseFramed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaSubscriptionCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseFramed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaSubscriptionCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseFramed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaSubscriptionCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaSubscriptionCommand parseFramed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaSubscriptionCommand().mergeFramed(data).checktInitialized();
   }

   public String toString() {
      return toString(new java.lang.StringBuilder(), "").toString();
   }

   public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
      if(  hasDestination() ) {
         sb.append(prefix+"destination {\n");
         getDestination().toString(sb, prefix+"  ");
         sb.append(prefix+"}\n");
      }
      if(  hasSubscriptionKey() ) {
         sb.append(prefix+"subscriptionKey: ");
         sb.append(getSubscriptionKey());
         sb.append("\n");
      }
      if(  hasRetroactive() ) {
         sb.append(prefix+"retroactive: ");
         sb.append(getRetroactive());
         sb.append("\n");
      }
      if(  hasSubscriptionInfo() ) {
         sb.append(prefix+"subscriptionInfo: ");
         sb.append(getSubscriptionInfo());
         sb.append("\n");
      }
      return sb;
   }

   public void visit(org.apache.activemq.store.kahadb.Visitor visitor) throws java.io.IOException {
      visitor.visit(this);
   }

   public KahaEntryType type() {
      return KahaEntryType.KAHA_SUBSCRIPTION_COMMAND;
   }

   public boolean equals(Object obj) {
      if( obj==this )
         return true;
      
      if( obj==null || obj.getClass()!=KahaSubscriptionCommand.class )
         return false;
      
      return equals((KahaSubscriptionCommand)obj);
   }
   
   public boolean equals(KahaSubscriptionCommand obj) {
      if (hasDestination() ^ obj.hasDestination() ) 
         return false;
      if (hasDestination() && ( !getDestination().equals(obj.getDestination()) ))
         return false;
      if (hasSubscriptionKey() ^ obj.hasSubscriptionKey() ) 
         return false;
      if (hasSubscriptionKey() && ( !getSubscriptionKey().equals(obj.getSubscriptionKey()) ))
         return false;
      if (hasRetroactive() ^ obj.hasRetroactive() ) 
         return false;
      if (hasRetroactive() && ( getRetroactive()!=obj.getRetroactive() ))
         return false;
      if (hasSubscriptionInfo() ^ obj.hasSubscriptionInfo() ) 
         return false;
      if (hasSubscriptionInfo() && ( !getSubscriptionInfo().equals(obj.getSubscriptionInfo()) ))
         return false;
      return true;
   }
   
   public int hashCode() {
      int rc=172060159;
      if (hasDestination()) {
         rc ^= ( 238021614^getDestination().hashCode() );
      }
      if (hasSubscriptionKey()) {
         rc ^= ( 1895830498^getSubscriptionKey().hashCode() );
      }
      if (hasRetroactive()) {
         rc ^= ( 512121604^ (getRetroactive()? 3:-3) );
      }
      if (hasSubscriptionInfo()) {
         rc ^= ( -1358848117^getSubscriptionInfo().hashCode() );
      }
      return rc;
   }
   
}

abstract class KahaSubscriptionCommandBase<T> extends org.apache.activemq.protobuf.BaseMessage<T> {

   // required KahaDestination destination = 1;
   private KahaDestination f_destination = null;

   public boolean hasDestination() {
      return this.f_destination!=null;
   }

   public KahaDestination getDestination() {
      if( this.f_destination == null ) {
         this.f_destination = new KahaDestination();
      }
      return this.f_destination;
   }

   public T setDestination(KahaDestination destination) {
      loadAndClear();
      this.f_destination = destination;
      return (T)this;
   }

   public void clearDestination() {
      loadAndClear();
      this.f_destination = null;
   }

   // required string subscriptionKey = 2;
   private java.lang.String f_subscriptionKey = null;
   private boolean b_subscriptionKey;

   public boolean hasSubscriptionKey() {
      return this.b_subscriptionKey;
   }

   public java.lang.String getSubscriptionKey() {
      return this.f_subscriptionKey;
   }

   public T setSubscriptionKey(java.lang.String subscriptionKey) {
      loadAndClear();
      this.b_subscriptionKey = true;
      this.f_subscriptionKey = subscriptionKey;
      return (T)this;
   }

   public void clearSubscriptionKey() {
      loadAndClear();
      this.b_subscriptionKey = false;
      this.f_subscriptionKey = null;
   }

   // optional bool retroactive = 3;
   private boolean f_retroactive = false;
   private boolean b_retroactive;

   public boolean hasRetroactive() {
      return this.b_retroactive;
   }

   public boolean getRetroactive() {
      return this.f_retroactive;
   }

   public T setRetroactive(boolean retroactive) {
      loadAndClear();
      this.b_retroactive = true;
      this.f_retroactive = retroactive;
      return (T)this;
   }

   public void clearRetroactive() {
      loadAndClear();
      this.b_retroactive = false;
      this.f_retroactive = false;
   }

   // optional bytes subscriptionInfo = 4;
   private org.apache.activemq.protobuf.Buffer f_subscriptionInfo = null;
   private boolean b_subscriptionInfo;

   public boolean hasSubscriptionInfo() {
      return this.b_subscriptionInfo;
   }

   public org.apache.activemq.protobuf.Buffer getSubscriptionInfo() {
      return this.f_subscriptionInfo;
   }

   public T setSubscriptionInfo(org.apache.activemq.protobuf.Buffer subscriptionInfo) {
      loadAndClear();
      this.b_subscriptionInfo = true;
      this.f_subscriptionInfo = subscriptionInfo;
      return (T)this;
   }

   public void clearSubscriptionInfo() {
      loadAndClear();
      this.b_subscriptionInfo = false;
      this.f_subscriptionInfo = null;
   }

}
