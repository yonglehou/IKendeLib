package beetle.npdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import beetle.netpackage.IDataReader;
import beetle.netpackage.IDataWriter;
import beetle.netpackage.IMessage;
import beetle.netpackage.Package;

public class NPPackage extends Package {

	@Override
	protected void WriteMessageType(IDataWriter writer, IMessage message)
			throws Exception {
		// TODO Auto-generated method stub
		writer.WriteUTF(message.getClass().getSimpleName());
	}

	@Override
	protected IMessage GetMessage(IDataReader reader) throws Exception {
		// TODO Auto-generated method stub
		String name= reader.ReadUTF();
		if(name.equals("Register"))
			return new Register();
		return null;
	}

}
