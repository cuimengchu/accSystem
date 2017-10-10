package jp.co.aliber.accsystem.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.aliber.accsystem.entity.auto.TLoginUser;
import jp.co.aliber.accsystem.entity.auto.TLoginUserExample;
import jp.co.aliber.accsystem.mapper.auto.TLoginUserMapper;

/**
 * ログインユーザー情報
 * 
 * @author zhong_zengqiang
 *
 */
@Service
public class TLoginUserService {

	@Autowired
	TLoginUserMapper tLoginUserMapper;

	/**
	 * ログインユーザー情報を取得(1件)
	 *
	 * @param emplyeeId
	 *            從業員番号
	 * @param compId
	 *            会社番号
	 * @return 從業員口座情報エンティティ
	 */
	public TLoginUser getTLoginUser(String loginId) {
		TLoginUserExample tLoginUserExample = new TLoginUserExample();
		tLoginUserExample.createCriteria().andLoginIdEqualTo(loginId);
		return tLoginUserMapper.selectByExample(tLoginUserExample).get(0);
	}
}
