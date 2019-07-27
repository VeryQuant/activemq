//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.store.kahadb.data;


public final class KahaRemoveScheduledJobsCommand extends KahaRemoveScheduledJobsCommandBase<KahaRemoveScheduledJobsCommand> implements org.apache.activemq.store.kahadb.JournalCommand<KahaRemoveScheduledJobsCommand> {

   public java.util.ArrayList<String> missingFields() {
      java.util.ArrayList<String> missingFields = super.missingFields();
      if(  !hasScheduler() ) {
         missingFields.add("scheduler");
      }
      if(  !hasStartTime() ) {
         missingFields.add("start_time");
      }
      if(  !hasEndTime() ) {
         missingFields.add("end_time");
      }
      return missingFields;
   }

   public void clear() {
      super.clear();
      clearScheduler();
      clearStartTime();
      clearEndTime();
   }

   public KahaRemoveScheduledJobsCommand clone() {
      return new KahaRemoveScheduledJobsCommand().mergeFrom(this);
   }

   public KahaRemoveScheduledJobsCommand mergeFrom(KahaRemoveScheduledJobsCommand other) {
      if (other.hasScheduler()) {
         setScheduler(other.getScheduler());
      }
      if (other.hasStartTime()) {
         setStartTime(other.getStartTime());
      }
      if (other.hasEndTime()) {
         setEndTime(other.getEndTime());
      }
      return this;
   }

   public int serializedSizeUnframed() {
      if (memoizedSerializedSize != -1)
         return memoizedSerializedSize;

      int size = 0;
      if (hasScheduler()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeStringSize(1, getScheduler());
      }
      if (hasStartTime()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeInt64Size(2, getStartTime());
      }
      if (hasEndTime()) {
         size += org.apache.activemq.protobuf.CodedOutputStream.computeInt64Size(3, getEndTime());
      }
      memoizedSerializedSize = size;
      return size;
   }

   public KahaRemoveScheduledJobsCommand mergeUnframed(org.apache.activemq.protobuf.CodedInputStream input) throws java.io.IOException {
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
            setScheduler(input.readString());
            break;
         case 16:
            setStartTime(input.readInt64());
            break;
         case 24:
            setEndTime(input.readInt64());
            break;
         }
      }
   }
   public void writeUnframed(org.apache.activemq.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (hasScheduler()) {
         output.writeString(1, getScheduler());
      }
      if (hasStartTime()) {
         output.writeInt64(2, getStartTime());
      }
      if (hasEndTime()) {
         output.writeInt64(3, getEndTime());
      }
   }

   public static KahaRemoveScheduledJobsCommand parseUnframed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaRemoveScheduledJobsCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseUnframed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaRemoveScheduledJobsCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseUnframed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaRemoveScheduledJobsCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseUnframed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaRemoveScheduledJobsCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseFramed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaRemoveScheduledJobsCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseFramed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaRemoveScheduledJobsCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseFramed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaRemoveScheduledJobsCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaRemoveScheduledJobsCommand parseFramed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaRemoveScheduledJobsCommand().mergeFramed(data).checktInitialized();
   }

   public String toString() {
      return toString(new java.lang.StringBuilder(), "").toString();
   }

   public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
      if(  hasScheduler() ) {
         sb.append(prefix+"scheduler: ");
         sb.append(getScheduler());
         sb.append("\n");
      }
      if(  hasStartTime() ) {
         sb.append(prefix+"start_time: ");
         sb.append(getStartTime());
         sb.append("\n");
      }
      if(  hasEndTime() ) {
         sb.append(prefix+"end_time: ");
         sb.append(getEndTime());
         sb.append("\n");
      }
      return sb;
   }

   public void visit(org.apache.activemq.store.kahadb.Visitor visitor) throws java.io.IOException {
      visitor.visit(this);
   }

   public KahaEntryType type() {
      return KahaEntryType.KAHA_REMOVE_SCHEDULED_JOBS_COMMAND;
   }

   public boolean equals(Object obj) {
      if( obj==this )
         return true;
      
      if( obj==null || obj.getClass()!=KahaRemoveScheduledJobsCommand.class )
         return false;
      
      return equals((KahaRemoveScheduledJobsCommand)obj);
   }
   
   public boolean equals(KahaRemoveScheduledJobsCommand obj) {
      if (hasScheduler() ^ obj.hasScheduler() ) 
         return false;
      if (hasScheduler() && ( !getScheduler().equals(obj.getScheduler()) ))
         return false;
      if (hasStartTime() ^ obj.hasStartTime() ) 
         return false;
      if (hasStartTime() && ( getStartTime()!=obj.getStartTime() ))
         return false;
      if (hasEndTime() ^ obj.hasEndTime() ) 
         return false;
      if (hasEndTime() && ( getEndTime()!=obj.getEndTime() ))
         return false;
      return true;
   }
   
   public int hashCode() {
      int rc=2030791195;
      if (hasScheduler()) {
         rc ^= ( 1843257499^getScheduler().hashCode() );
      }
      if (hasStartTime()) {
         rc ^= ( -125326801^(new Long(getStartTime())).hashCode() );
      }
      if (hasEndTime()) {
         rc ^= ( 57410088^(new Long(getEndTime())).hashCode() );
      }
      return rc;
   }
   
}

abstract class KahaRemoveScheduledJobsCommandBase<T> extends org.apache.activemq.protobuf.BaseMessage<T> {

   // required string scheduler = 1;
   private java.lang.String f_scheduler = null;
   private boolean b_scheduler;

   public boolean hasScheduler() {
      return this.b_scheduler;
   }

   public java.lang.String getScheduler() {
      return this.f_scheduler;
   }

   public T setScheduler(java.lang.String scheduler) {
      loadAndClear();
      this.b_scheduler = true;
      this.f_scheduler = scheduler;
      return (T)this;
   }

   public void clearScheduler() {
      loadAndClear();
      this.b_scheduler = false;
      this.f_scheduler = null;
   }

   // required int64 start_time = 2;
   private long f_startTime = 0;
   private boolean b_startTime;

   public boolean hasStartTime() {
      return this.b_startTime;
   }

   public long getStartTime() {
      return this.f_startTime;
   }

   public T setStartTime(long startTime) {
      loadAndClear();
      this.b_startTime = true;
      this.f_startTime = startTime;
      return (T)this;
   }

   public void clearStartTime() {
      loadAndClear();
      this.b_startTime = false;
      this.f_startTime = 0;
   }

   // required int64 end_time = 3;
   private long f_endTime = 0;
   private boolean b_endTime;

   public boolean hasEndTime() {
      return this.b_endTime;
   }

   public long getEndTime() {
      return this.f_endTime;
   }

   public T setEndTime(long endTime) {
      loadAndClear();
      this.b_endTime = true;
      this.f_endTime = endTime;
      return (T)this;
   }

   public void clearEndTime() {
      loadAndClear();
      this.b_endTime = false;
      this.f_endTime = 0;
   }

}
