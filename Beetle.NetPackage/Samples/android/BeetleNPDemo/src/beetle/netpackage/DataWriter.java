package beetle.netpackage;

import java.io.DataOutputStream;
import java.io.IOException;
/**
 * Copyright © henryfan 2013
 * Created by henryfan on 13-7-30.
 * homepage:www.ikende.com
 * email:henryfan@msn.com
 */
public class DataWriter implements IDataWriter {

	public DataWriter(DataOutputStream stream)
	{
		mStream = stream;
	}
	
	private DataOutputStream mStream;
	
	@Override
	public DataOutputStream GetStream() {
		// TODO Auto-generated method stub
		return mStream;
	}

	@Override
	public void Write(byte[] data, int off, int len) throws IOException {
		mStream.write(data, off, len);
		
	}

	@Override
	public void Write(boolean value) throws IOException {
		// TODO Auto-generated method stub
		mStream.writeBoolean(value);
	}

	@Override
	public void Write(byte value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeByte(value);
	}

	@Override
	public void Write(char value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeChar(value);
	}

	@Override
	public void Write(double value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeDouble(value);
	}

	@Override
	public void Write(float value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeFloat(value);
	}

	@Override
	public void Write(int value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeInt(value);
	}

	@Override
	public void Write(short value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeShort(value);
	}

	@Override
	public void Write(long value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeLong(value);
	}

	@Override
	public void WriteUTF(String value)throws IOException {
		// TODO Auto-generated method stub
		mStream.writeUTF(value);
	}

	@Override
	public void Write(IMessage msg)throws Exception {
		msg.Save(this);
		
	}

}
