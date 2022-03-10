package com.company.blockchain;

import java.util.ArrayList;

public class blockchain {
    ArrayList<block> chain=new ArrayList<>();

    public static void main(String[] args) {
        String[] genesisTransactions={"stark sent 100 bitcoins"};
        block genesisBlock=new block(0,genesisTransactions);

        String[] block2transaction={"steve sent 10 bitcoins"};
        block block2=new block(genesisBlock.getBlockHash(),block2transaction);

        System.out.println(genesisBlock.getBlockHash());
        System.out.println(block2.getBlockHash());

    }
}