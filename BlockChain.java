package blockChain;

import java.util.Date;

public class BlockChain{
  
  public String hash;
  public String previousHash;
  private String data; //Data will be represented as a simple message
  private long timeStamp;
  
  //Block Constructor
  //String has will hold our digital signature
  //previousHash will hold the previous block's hash 
  //String data will hold our block data 
