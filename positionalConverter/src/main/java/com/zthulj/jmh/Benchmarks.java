package com.zthulj.jmh;

import com.zthulj.converter.PositionalConverter;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(value = Scope.Benchmark)
public class Benchmarks {

    PositionalConverter.Position[] positions = {
            new PositionalConverter.Position("0", 0, 99), new PositionalConverter.Position("1", 100, 199), new PositionalConverter.Position("2", 200, 299), new PositionalConverter.Position("3", 300, 399),
            new PositionalConverter.Position("4", 400, 499), new PositionalConverter.Position("5", 500, 599), new PositionalConverter.Position("6", 600, 699), new PositionalConverter.Position("7", 700, 799),
            new PositionalConverter.Position("8", 800, 899), new PositionalConverter.Position("9", 900, 999), new PositionalConverter.Position("10", 1000, 1099), new PositionalConverter.Position("11", 1100, 1199),
            new PositionalConverter.Position("12", 1200, 1299), new PositionalConverter.Position("13", 1300, 1399), new PositionalConverter.Position("14", 1400, 1499), new PositionalConverter.Position("15", 1500, 1599),
            new PositionalConverter.Position("16", 1600, 1699), new PositionalConverter.Position("17", 1700, 1799), new PositionalConverter.Position("18", 1800, 1899), new PositionalConverter.Position("19", 1900, 1999),
            new PositionalConverter.Position("20", 2000, 2099), new PositionalConverter.Position("21", 2100, 2199), new PositionalConverter.Position("22", 2200, 2299), new PositionalConverter.Position("23", 2300, 2399),
            new PositionalConverter.Position("24", 2400, 2499), new PositionalConverter.Position("25", 2500, 2599), new PositionalConverter.Position("26", 2600, 2699), new PositionalConverter.Position("27", 2700, 2799),
            new PositionalConverter.Position("28", 2800, 2899), new PositionalConverter.Position("29", 2900, 2999), new PositionalConverter.Position("30", 3000, 3099), new PositionalConverter.Position("31", 3100, 3199),
            new PositionalConverter.Position("32", 3200, 3299), new PositionalConverter.Position("33", 3300, 3399), new PositionalConverter.Position("34", 3400, 3499), new PositionalConverter.Position("35", 3500, 3599),
            new PositionalConverter.Position("36", 3600, 3699), new PositionalConverter.Position("37", 3700, 3799), new PositionalConverter.Position("38", 3800, 3899), new PositionalConverter.Position("39", 3900, 3999),
            new PositionalConverter.Position("40", 4000, 4099), new PositionalConverter.Position("41", 4100, 4199), new PositionalConverter.Position("42", 4200, 4299), new PositionalConverter.Position("43", 4300, 4399),
            new PositionalConverter.Position("44", 4400, 4499), new PositionalConverter.Position("45", 4500, 4599), new PositionalConverter.Position("46", 4600, 4699), new PositionalConverter.Position("47", 4700, 4799),
            new PositionalConverter.Position("48", 4800, 4899), new PositionalConverter.Position("49", 4900, 4999)
    };

    PositionalConverter converter = new PositionalConverter(positions);

    String positionalMessage = "*G&7,$j{_nGF&rvHShT8chg5R}54vqx.NLi/!%,!Smd,=%z2kb?(q]b5}*pZg[bz_P.RB,2jmv4Apt?+zrX)wm5Qj9r_,Yb2rRH[wt3WtLG&@TLY}d!gihWg9(d&?/xLza2(D6GmxmfvA?2aS.yUF)&Z}M%SaCVKyj;pLbff**Q&,?fjz?.WT+/iP*?(&aCcvR(4_YtLWyYXz+/f82(j_MJyDQ!Zrt9hAey%EN8wLiF&/%-zpGN=rCp3AV#8jPhPFK=Wv:SC?jbE(JxywQ&g$Z3qZeXV*Q?t6Y4mU9#;2-W)-t?/}Sy*(PgzNkgzm@UFk]/{vQ;L=h{VMr7MqMHfTGw3m(#*Lk{/RW:whrD.U%Jd)aqUSR*j5CRkH)}+c4ggK!uS?/niqXjc:8rV4uh{*$yT/tzT,C%.q]{{Sbar;?)*/L.ck@Dty:g[+#HE$fTa+3NU6$ape$9!?AB+=UZ-Miv=Y@N!D3;K,]EzUcg%Zh}Hwu)q7bg3qF:Mp;zSt3;(4z5}tX6=L&w*X{gj?izqT&#3YQX#D).t}G[rZ2FAf$zw.k2SDw?g%Z#/vQAQf2u#*BVQEWV4u5ha_+jPj-Ba29Z4;8B+PwA}LX&xYnBS@JiD,z{VJm)BTQg%3Gi6Z+TgEaF*KXfkbng4dJ)Xiq5@Ap[xtE4fJ37DyaiJ65[&RXJ49Lj7X;DWgQB.Pgtv;B+8ak&+DG$qAMmnX==*x+6}_P=)#Pq+jB((a;8HUdBN8c?.qJ}ES$,PPkUXLELFRJzNyx-#7VJexB4RhS_N(h)U!=z%/zehS&bybBu}4c.*[T3HNAHjgSgM@7qdYL7=S&6F;TGvb}2][-6x3a:=QEVbiuYz{)F]DYj({2?Q6H%vh+-Fp-q&)/9&P$M);/=C!(hwk[W6yRf3Q],a/)+QVZL!P3;83_,JWKU%L{XyFaw]4CaKe93nFDg7.vza{KK[uD(r:3j}&S!&yqvv5q4Lh4_d);T{WL5g.fN93BM,Zz?P&r[j??vpM4yt9-t:DMZyiP@@R9V+qcdz/8PcK97i!Brv*T{MiZj6Mc$(NBj5&kkD8}mmAfFC)(}-xUJ7EVVT=q)P%S=RQH*@CYxqt_J@j7!i(itBbgYDJZkpDgV[Qm*3]g-V_XnKjm_JVZE2%Te[xbM*T7yAvgBH{+&dB$zLWV4+RP?#NQXEtKrKRi79+mD2]z_xR#(R5+uz!Em:Eg5=r:.*8vnQzK!P8,C*tK}wp;jWd5Qp;r_Q;T8Uvu@Qt2$qeSk-8Y]Smk6iEt$Gg)BTV.y!$A;BZTQE/mzXaazpV*_ti[9]==qu[V;c%;c}vV!T3!}7E]-:VhLi-jLhbGE{8)kE$am5X=.3S?-fqJ)QEM$xL2,YzJKkXJ9mpS2TX$Z/d&%LWXf*!h;a;6[HVS6-XQ$JVq)Xk%Ku+]B?KuMcX/_JNSf2/{u{;8zqz%f?rMMdQ,K3HQBKJB&G7Y/8N@z}vFw&.}(G8{/MwuJrbc5}tjF@84-?*Hbz8$k3PBb4;-WJx%jvDDZfBPKHAM82dZpQD(Tz@/yeETU*Yj&u@yy@PqfnAgwkn/VU8/eB,77ki4,uFg])W9S@!mkrh]u97um:jSQufy5R}2t@R*eFtB.HDW%u(6z4Q4WkL:=n!eQD7Hq8hZ=Uj&uzi3J/GJg;i]NRXinQBzFigC&8}{{Cg)wB_5CeJXhZ)g2uJ$x=8FEmpt=??-RTAE)dJ*!E]%v_+557D$H9eC_TL2w[Lty7]dBw+._-hamXPw])cWJC5@.;_n.-b_:xa)$Q$TJD=f32(-Vf@6Mg}MUUe*]+*r2-/fb*.T-ueLM8(#?G{k*m7Kig;g/HcAfQLqV%Lf=c65XqgJm=4Chp4&4Mzufq5%JyX99B{V/]pBM-4x5ia}NJ?rn9dcU]LMPH,NKpr$UXTu;x&QaE*D]e4N4*Xa(.c-w+3w#{VqWLCYnW:Bwd(5u:-[zTc(GJu?dpGnk8/[{2)2r(d{p@h3*AAf5-Vi_x%7uYL)NeT#&7,SGARq$Mi-Th2M+f5_h6eJQq?{d9@fqvL66,-j_-;[V[E.NYK,x{PJ(*%;_$e7J#Zn-%qKCkcid?7T/:7!U*L;Gi8!HBB@f42kF+}wLeqKbKz%4UJEqh,Qc2e=$i4tPHYJRJzg_KBB6B?L::RG+8[/=de?mMRjP82YV5c=En.EXWAM]2Q[(884Ui&TR}QdT=TQZ&#LYy&WUC!;]){N=SSVmD(F9Gg[!r-vG:-weX+NT5dY!.@DB=CS*H)Vwy$8/qtGGA*2)L33UHDjf2cuY)]9%ff-e6KC%k(qW59XhHzzKENPcyU%x$cA6m@G$7JCGXtdNa5xPv2#KJ.H5gvV,HK][U=V!,4Wj7GQCzpuJA%aVp)qve}Pxjr[h#k,BvPwSuX2Knbgz$fN&h:a)Q-y2fye3EuKG2-_p$VV&bJrM*.Wy&!9A6mZAUFtg}@Cyc]BM#i$2&.L9:RDAVx{.Q(?miUuZ-{VCXF*!5WgJ:iGGT?cjiEGQ?3[n*;A6Y)eM.,D%VYgjVmLz$Waq_=c&9qX=MBp!H6mPq+AMM3y$hP}tV69hhTTHY=49+Wijm977]wDiem(xmSWf[7a&Nh#,y?/+5_)ZmQM!2:n-TbwW{jUjW2j/AC?]gQYUUJ{}F6JPY/27xyGx.%r4iX2Tj2JAU]XE/h&N?huM44e[bGW+MV$:.EE)SyfPr[dLHL6}P]/B!M}PEWQX(j,;J_!qN]Mp@KQ$c[F2bFMtm8e*Y6EU$aA-hVmZ?]@m-7-Fv}eY:i!at=BC4.x@uu.uWq%_S/}GG#38X?[6_[)EkGgNgTN)=dz)vrGFiA{R}dp}=?ue-DmEcPNtF?5&@/z8bkcJU.Bjdp574bUxj!_&}P:8!LTZ=tpWq{HBu6S,Y:X&b8[a&P)4_@q_DwU4?;4R!Ghn&NX5v[t/quzhB6:mctgiR+g+[cdL3]tNr@.8NET;j@#PRbr}dzT.E+Baa#_X/iVH2R4h9w$q6?CqFY+)hr*THRSHZ-[McK8uDfLPw[p;KSn;L,.&Ui+9D6XxSR]:!v{}SZ*GqDjP.SK6EP(n=tn/UwHquUpNH!?c:UGrWRP}rF.C}fRP942Ax[=.$&yZn2pfaG;Yf7FXMA_4FD:FWMWB{;%5jayH(@-[h7yca:NhwXN%Aa(hF.MfC4[/xLTyC[y%*P%G2.$P(YV:&E)[.}Yh&Tf}d5dgfy]}S__&A7bkR:B2*88q39Y%4,SjM)2p6jVg7:Apd;6;iUj%h?p,_m9,KGuZAE$5M7$*AkH,=%Pk;t7Y}y*et,@xDi2@+7Fhkp!ydu(:@w=FD?={yDVhe/U7E@$3Y{J?%pz*Njmh53Y5PrXzE5mRF!gPW)YxM@r-h$wYU!QhrU23Qf@vc-.4t6mGhW4.vnZiiH#DpAQ[jwT?4VfF!M5kybw)2F%mXvCfj*!}]duCHy*5K.QYTgbBq4qYCNm=4D6U7g7SF6k}x;t#C8QyXECmga,Rdh_jFbL/h6-6}ZRH*ud;gZznGD+EHgv-pfvKi-nNY#Yf.6}t}]5S)=:&i/jyW?A]N&R)qPPy(8dH!XeS+A/biB8fGytTP8RCHK:)af6?9@p]bxp8z9_zd@n%8GJA[W)G=Pw.Nrf.3(/+h&Fn7RgWD!BpGa/+da{MFaZ3(D2t;u3xm446Xu:FmZx_H.(_(=.nv.vpxS2yRH@:ix)qhhmTM)92BJG,+,$[c$w&/5j3MQqv(m}S=fTfTLTzhEi;&w:W[WT_?+&a/#Em%pdh9LD=ha6TmJD8aHBvvZkS$77-*Wg#NKTNQGv$Cw4qt3bEwDDF[&?qfaRz9S,KQ*_akHjPe=?#?.Wz3R#D&e9G-#z@]Ne#M&#cSZ5Wbyn)-U@;{!}m4zLn6mC{tk[Wy3-@7(3V9-vUhwdqwL{8;6wBVcH7R!x3gZ[bUdjdM]yM%4@bU,X@:)_JMx6tzi@5-AeA3.d&5#v?E*aH+/KQMJq72$({wBEnkx?3[V].2Ui?-@uzPZ-!yS}H?p,:-&SRrPKdNuDcQ%hK@7-GRR#7,k+hr#Y[kQW/82NLv4V&kGG](3z5.#X{N$NS2PHQ4[A-9A}U4yX;@wTY{qn2D,B4&.w/Qr5]Y5BBhq_?cRZbb6ny_WfTXSiwAm=}-&RZZtRDkCqfum(}u}ePKH$5fNPgzZvdjhrF#?eYrx(Ybe{wR7eWW!YW5d5}?Te.iy}d!b:zh$V6@]S)mAr_e[2jyv$x%LMfKR%Xv3jE_8;h%F,TFPFCT{CA-haJTZ%?rb4X86W,(C+m/;g6w}hf-U;haBBm2S[d+64mrp_U5eYEAyUbTTvcEZv=c;F;&WFka?jJQA{]ikyqUPX]jMjFf/;,qVce:EHPtjZ?_K@MB}dKX5xcYn/]=5kLc!x{XC!D7=w7i@uSurVhD[3G(d!Q92d&AwW,UZ)./PgK(qG4}8By=:C5+=QhRz7-av7?k@$C#Dm{6A,a:C%2ZJJWkX:g=bvyf{?(wtdzKU9tta;Mr}V-e?:hA;j#].nbYCm*A(qjvm@/Labk48efymz::cFfJA_dGj#{a7*HeKq!c)+5,4vgm;{bBkPqLPXkgv}_Q#iw[K3gxLH)$y!7/pQTYeMKaSRb{K!TFkZtu2BYPNYK(/B.je.+Tc:8dr,XF.NpZL,]xcqkyX)3EvNJ!Lin[maT!}uQ_XPwLvhUGwUHb-P{Sd597Ve!A!feMA#R/(3mFrJ8d-yzVR=iV*X_:/jE9Jwd=.32Z8!.ur2;+rYuYaxCCZB%eEhXDD;;6:E24LFT%eLK&n!W8H!axxUWmQwE+C=R(59b.7H[@kRW;.Ke;9;u9L28(HwYVAx7HQ};CKdpf;}#.?V)f[-68zi+KfNK_FnhuVr}Rj3TA3Eg3&pX-dUhV,x!8.rk.(=/wVab.J@NwT$PL,VN$wxHXJJE!zK%=dj*,M${:R);YjVDGZw(?JrifjJB)QT?r3ATZrLP626H)PpFyT+}W}p8r.(.QypZjW&iJVAW-Q+6T@7Xu=![]VKfp#cnWjmgx";

    @Param({"1", "1000", "10000", "100000"})
    public int iterations;

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 2, time = 50, timeUnit = TimeUnit.MILLISECONDS)
    public void benchmark() {
        for (int i = 0; i < iterations; i++) {
            converter.convert_1(positionalMessage);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 2, time = 50, timeUnit = TimeUnit.MILLISECONDS)
    public void benchmark2() {
        for (int i = 0; i < iterations; i++) {
            converter.convert_2(positionalMessage);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 2, time = 50, timeUnit = TimeUnit.MILLISECONDS)
    public void benchmark3() {
        for (int i = 0; i < iterations; i++) {
            converter.convert_3(positionalMessage);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 2, time = 50, timeUnit = TimeUnit.MILLISECONDS)
    public void benchmark4() {
        for (int i = 0; i < iterations; i++) {
            converter.convert_4(positionalMessage);
        }
    }
}
